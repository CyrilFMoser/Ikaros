package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[T_B[D], Boolean]) extends T_A[D, (T_A[Char, Byte],T_A[(Char,Int), Boolean])]
case class CC_B(a: CC_A[Boolean], b: CC_A[CC_A[Boolean]]) extends T_B[(T_B[Int],T_B[Byte])]
case class CC_C() extends T_B[(T_B[Int],T_B[Byte])]
case class CC_D(a: CC_A[CC_A[CC_B]], b: CC_C) extends T_B[(T_B[Int],T_B[Byte])]

val v_a: T_B[(T_B[Int],T_B[Byte])] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_C() => 1 
  case CC_D(CC_A(_, _), CC_C()) => 2 
}
}