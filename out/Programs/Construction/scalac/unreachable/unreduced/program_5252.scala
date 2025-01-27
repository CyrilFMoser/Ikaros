package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Int,Int)]]) extends T_A[(T_A[Byte],T_A[Byte])]
case class CC_B() extends T_A[CC_A]
case class CC_C(a: CC_A, b: T_A[T_A[CC_B]]) extends T_A[CC_A]

val v_a: T_A[CC_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_), _) => 1 
}
}