package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, Char]], b: Byte, c: T_A) extends T_A
case class CC_B[C]() extends T_B[(T_B[Int, T_A],Byte), C]
case class CC_C[D](a: (CC_A,T_A)) extends T_B[(T_B[Int, T_A],Byte), D]

val v_a: T_B[(T_B[Int, T_A],Byte), Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((CC_A(_, _, _),CC_A(_, _, _))) => 1 
}
}