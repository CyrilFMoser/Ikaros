package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: T_A[T_B[Boolean]]) extends T_A[T_B[Boolean]]
case class CC_C(a: CC_A[Int], b: Int, c: (CC_A[CC_B],T_B[Byte])) extends T_A[T_B[Boolean]]
case class CC_D(a: T_A[T_B[Boolean]], b: T_A[T_B[Boolean]]) extends T_B[((CC_B,CC_B),T_A[Char])]

val v_a: T_A[T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(CC_A(), 12, (CC_A(),_)) => 2 
  case CC_C(CC_A(), _, (CC_A(),_)) => 3 
}
}