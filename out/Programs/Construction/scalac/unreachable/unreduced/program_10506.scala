package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Int]], b: T_A[T_B[Boolean]], c: T_B[T_A[Boolean]]) extends T_A[(T_A[Byte],T_B[(Byte,Int)])]
case class CC_B() extends T_A[(T_A[Byte],T_B[(Byte,Int)])]
case class CC_C(a: CC_A, b: CC_A) extends T_A[CC_B]

val v_a: T_A[(T_A[Byte],T_B[(Byte,Int)])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}