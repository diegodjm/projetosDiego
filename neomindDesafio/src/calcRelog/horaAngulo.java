package calcRelog;

import java.util.Date;



public class horaAngulo {
	private static final int horaexata = 0;

	public static void main(String arg[]){
		Integer hora = 0;
		Integer minuto = 0;
		Date data = new Date();
		System.out.println(data);
		System.out.println("Hora:"+data.getHours()+" "+"Minuto:"+data.getMinutes());
		hora = data.getHours();
		minuto = data.getMinutes();
		
		int angulo = 0;
		if (hora == 0 || hora == 12) {
			if (minuto > 0 && minuto <= 15) {
				System.out.println("Angulo 45º");
			}else
				if (minuto > 15 && minuto <= 30) {
					System.out.println("Angulo 90º");
				}else
					if (minuto > 30 && minuto <= 45) {
						System.out.println("Angulo 135º");
					}else
						if (minuto > 45) {
							System.out.println("Angulo 180º");
						}
		}else
			if (hora == 1 || hora == 13) {
				if (minuto > 0 && minuto <= 15) {
					System.out.println("Angulo 45º");
				}else
					if (minuto > 15 && minuto <= 30) {
						System.out.println("Angulo 90º");
					}else
						if (minuto > 30 && minuto <= 45) {
							System.out.println("Angulo 135º");
						}else
							if (minuto > 45) {
								System.out.println("Angulo 180º");
							}
			}else
				if (hora == 2 || hora == 14) {
					if (minuto > 0 && minuto <= 15) {
						System.out.println("Angulo 45º");
					}else
						if (minuto > 15 && minuto <= 30) {
							System.out.println("Angulo 90º");
						}else
							if (minuto > 30 && minuto <= 45) {
								System.out.println("Angulo 135º");
							}else
								if (minuto > 45) {
									System.out.println("Angulo 180º");
								}
				}else
					if (hora == 3 || hora == 15) {
						if (minuto > 0 && minuto <= 15) {
							System.out.println("Angulo 180º");
						}else
							if (minuto > 15 && minuto <= 30) {
								System.out.println("Angulo 45º");
							}else
								if (minuto > 30 && minuto <= 45) {
									System.out.println("Angulo 90º");
								}else
									if (minuto > 45) {
										System.out.println("Angulo 135º");
									}
					}else
						if (hora == 4 || hora == 16) {
							if (minuto > 0 && minuto <= 15) {
								System.out.println("Angulo 180º");
							}else
								if (minuto > 15 && minuto <= 30) {
									System.out.println("Angulo 45º");
								}else
									if (minuto > 30 && minuto <= 45) {
										System.out.println("Angulo 90º");
									}else
										if (minuto > 45) {
											System.out.println("Angulo 135º");
										}
						}else
							if (hora == 5 || hora == 17) {
								if (minuto > 0 && minuto <= 15) {
									System.out.println("Angulo 180º");
								}else
									if (minuto > 15 && minuto <= 30) {
										System.out.println("Angulo 45º");
									}else
										if (minuto > 30 && minuto <= 45) {
											System.out.println("Angulo 90º");
										}else
											if (minuto > 45) {
												System.out.println("Angulo 135º");
											}
							}else
								if (hora == 6 || hora == 18) {
									if (minuto > 0 && minuto <= 15) {
										System.out.println("Angulo 135º");
									}else
										if (minuto > 15 && minuto <= 30) {
											System.out.println("Angulo 180º");
										}else
											if (minuto > 30 && minuto <= 45) {
												System.out.println("Angulo 45º");
											}else
												if (minuto > 45) {
													System.out.println("Angulo 90º");
												}
								}else
									if (hora == 7 || hora == 19) {
										if (hora == 6 || hora == 18) {
											if (minuto > 0 && minuto <= 15) {
												System.out.println("Angulo 135º");
											}else
												if (minuto > 15 && minuto <= 30) {
													System.out.println("Angulo 180º");
												}else
													if (minuto > 30 && minuto <= 45) {
														System.out.println("Angulo 45º");
													}else
														if (minuto > 45) {
															System.out.println("Angulo 90º");
														}
									}else
										if (hora == 6 || hora == 18) {
											if (minuto > 0 && minuto <= 15) {
												System.out.println("Angulo 135º");
											}else
												if (minuto > 15 && minuto <= 30) {
													System.out.println("Angulo 180º");
												}else
													if (minuto > 30 && minuto <= 45) {
														System.out.println("Angulo 45º");
													}else
														if (minuto > 45) {
															System.out.println("Angulo 90º");
														}
										}else
											if (hora == 9 || hora == 21) {
												if (minuto > 0 && minuto <= 15) {
													System.out.println("Angulo 90º");
												}else
													if (minuto > 15 && minuto <= 30) {
														System.out.println("Angulo 135º");
													}else
														if (minuto > 30 && minuto <= 45) {
															System.out.println("Angulo 180º");
														}else
															if (minuto > 45) {
																System.out.println("Angulo 45º");
															}
											}else
												if (minuto > 0 && minuto <= 15) {
													System.out.println("Angulo 90º");
												}else
													if (minuto > 15 && minuto <= 30) {
														System.out.println("Angulo 135º");
													}else
														if (minuto > 30 && minuto <= 45) {
															System.out.println("Angulo 180º");
														}else
															if (minuto > 45) {
																System.out.println("Angulo 45º");
															}
												}else
													if (minuto > 0 && minuto <= 15) {
														System.out.println("Angulo 90º");
													}else
														if (minuto > 15 && minuto <= 30) {
															System.out.println("Angulo 135º");
														}else
															if (minuto > 30 && minuto <= 45) {
																System.out.println("Angulo 180º");
															}else
																if (minuto > 45) {
																	System.out.println("Angulo 45º");
																}
													
		
			
		
		
	 
		
	}
		
	
}
