package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[(Boolean,T_B)], b: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: T_A[Int], b: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: CC_A, b: (T_A[T_B],CC_A)) extends T_B
case class CC_D(a: (Int,CC_A), b: T_A[T_B], c: CC_B) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _), (_,_)) => 0 
  case CC_D(_, CC_A(_, _), _) => 1 
  case CC_D(_, CC_B(_, _), _) => 2 
  case CC_E() => 3 
}
}