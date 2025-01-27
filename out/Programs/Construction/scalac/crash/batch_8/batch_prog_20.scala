package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[T_A[D, D], D], b: (CC_A[Byte],Boolean), c: Char) extends T_A[T_A[D, D], D]
case class CC_C[E](a: T_A[T_A[E, E], T_A[E, E]], b: T_A[T_A[E, E], E]) extends T_A[T_A[T_A[T_A[Boolean, Boolean], (Boolean,Char)], T_A[T_A[Boolean, Boolean], (Boolean,Char)]], T_A[T_A[Boolean, Boolean], (Boolean,Char)]]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(CC_A(_), _, _)) => 1 
  case CC_A(CC_B(CC_B(_, _, _), _, _)) => 2 
  case CC_B(CC_A(_), (CC_A(_),_), _) => 3 
  case CC_B(CC_B(CC_A(_), _, _), (CC_A(_),_), _) => 4 
  case CC_B(CC_B(CC_B(_, _, _), _, _), (CC_A(_),_), _) => 5 
}
}