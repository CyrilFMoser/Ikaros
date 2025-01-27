package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Char]], b: T_A[T_A[Byte]], c: Byte) extends T_A[((Char,Int),T_A[Boolean])]
case class CC_B[C]() extends T_A[C]
case class CC_C(a: (T_B[CC_A],CC_A), b: T_A[Int], c: Char) extends T_B[CC_A]
case class CC_D[D]() extends T_B[D]

val v_a: T_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}