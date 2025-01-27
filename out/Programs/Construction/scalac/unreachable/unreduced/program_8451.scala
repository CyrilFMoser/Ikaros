package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, (Boolean,Int)],T_A[Boolean, Char])) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[T_A[D, D], D], b: D) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(CC_B(_, 'x'), _) => 1 
  case CC_B(CC_B(_, _), _) => 2 
}
}
// This is not matched: CC_B(CC_A(_), _)