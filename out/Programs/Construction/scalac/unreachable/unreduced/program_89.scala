package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Byte], b: T_A[T_B[Boolean]], c: T_A[T_B[(Boolean,Boolean)]]) extends T_A[T_B[T_B[Char]]]
case class CC_B[C](a: CC_A) extends T_A[C]
case class CC_C(a: T_B[(CC_A,Char)], b: T_A[CC_A]) extends T_A[T_B[T_B[Char]]]
case class CC_D() extends T_B[CC_C]
case class CC_E(a: Int) extends T_B[CC_C]
case class CC_F() extends T_B[CC_C]

val v_a: T_A[T_B[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_), CC_B(_), CC_B(_)) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}