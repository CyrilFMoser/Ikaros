package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int, b: T_A[T_A[Int]]) extends T_A[Int]
case class CC_B(a: CC_A, b: T_A[Int]) extends T_A[Int]
case class CC_C(a: (Boolean,CC_B)) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(CC_A(_, _), _) => 2 
  case CC_C((_,_)) => 3 
}
}