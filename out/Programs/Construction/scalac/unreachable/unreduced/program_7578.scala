package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]]) extends T_A[(T_A[Byte],T_A[Int])]
case class CC_B[B](a: B, b: T_A[B], c: B) extends T_A[(T_A[Byte],T_A[Int])]

val v_a: T_A[(T_A[Byte],T_A[Int])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}