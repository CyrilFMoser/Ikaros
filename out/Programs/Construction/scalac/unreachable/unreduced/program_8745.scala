package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: T_A[Int], b: T_A[T_A[Byte]]) extends T_B[(T_A[Byte],T_A[Boolean])]
case class CC_C(a: (Boolean,T_B[CC_B]), b: T_B[Int]) extends T_B[(T_A[Byte],T_A[Boolean])]
case class CC_D(a: T_B[Byte]) extends T_B[(T_A[Byte],T_A[Boolean])]

val v_a: T_B[(T_A[Byte],T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _) => 0 
  case CC_C(_, _) => 1 
  case CC_D(_) => 2 
}
}