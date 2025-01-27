package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[B]
case class CC_B() extends T_A[T_A[CC_A[T_B]]]
case class CC_C() extends T_B
case class CC_D(a: T_B, b: T_A[CC_A[CC_C]], c: T_A[CC_A[Int]]) extends T_B
case class CC_E(a: T_A[Byte]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_C(), CC_A(), _) => 1 
  case CC_D(CC_D(CC_C(), _, CC_A()), CC_A(), _) => 2 
  case CC_D(CC_D(CC_D(_, _, _), _, CC_A()), CC_A(), _) => 3 
  case CC_D(CC_D(CC_E(_), _, CC_A()), CC_A(), _) => 4 
  case CC_D(CC_E(CC_A()), CC_A(), _) => 5 
  case CC_E(CC_A()) => 6 
}
}