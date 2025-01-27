package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: (T_A[Int, Boolean],T_A[Int, Char])) extends T_A[T_A[C, C], C]
case class CC_B[D](a: CC_A[D]) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), (_,_)) => 0 
  case CC_A(CC_A(CC_B(_), _), (_,_)) => 1 
  case CC_A(CC_B(CC_A(_, _)), (_,_)) => 2 
  case CC_B(_) => 3 
}
}