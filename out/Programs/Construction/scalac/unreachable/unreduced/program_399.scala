package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[Byte]
case class CC_B(a: (T_A[Byte],T_B[CC_A]), b: T_A[CC_A]) extends T_A[Byte]
case class CC_C(a: T_A[Byte], b: T_A[Byte], c: T_B[CC_A]) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, CC_A(), _) => 2 
  case CC_C(_, CC_B(_, _), _) => 3 
  case CC_C(_, CC_C(_, _, _), _) => 4 
}
}