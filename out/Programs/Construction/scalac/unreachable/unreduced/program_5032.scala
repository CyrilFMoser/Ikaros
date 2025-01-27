package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B(a: CC_A, b: (Int,CC_A), c: T_A[CC_A]) extends T_A[T_B]
case class CC_C(a: T_A[T_B], b: CC_B) extends T_A[T_B]

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_C(CC_A(), _) => 2 
  case CC_C(CC_B(CC_A(), (_,_), _), _) => 3 
  case CC_C(CC_C(_, _), _) => 4 
}
}