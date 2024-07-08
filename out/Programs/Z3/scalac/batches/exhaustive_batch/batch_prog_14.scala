package Program_14 

 object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_A[D], b: D) extends T_B[D]
case class CC_C(a: Int) extends T_B[T_B[(Char,Byte)]]

val v_a: T_B[T_B[(Char,Byte)]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_B(_, _) => 1 
}
}