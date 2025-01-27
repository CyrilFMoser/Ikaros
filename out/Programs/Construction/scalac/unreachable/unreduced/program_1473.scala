package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: Int) extends T_A[Byte]
case class CC_B(a: T_A[CC_A]) extends T_A[Byte]
case class CC_C(a: (T_A[CC_B],T_A[CC_B]), b: T_A[Byte], c: CC_B) extends T_A[CC_B]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_), _) => 1 
  case CC_B(_) => 2 
}
}