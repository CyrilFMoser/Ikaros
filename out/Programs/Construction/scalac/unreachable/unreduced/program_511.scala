package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Boolean], b: (T_A[Char, Boolean],T_A[Boolean, (Boolean,Int)]), c: T_A[C, Boolean]) extends T_A[C, Boolean]
case class CC_B[D](a: T_A[D, D], b: D) extends T_A[D, Boolean]
case class CC_C[E](a: T_A[E, Boolean]) extends T_A[E, Boolean]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _)) => 0 
  case CC_A(CC_B(_, _), (_,_), CC_A(_, _, _)) => 1 
  case CC_A(CC_C(_), (_,_), CC_A(_, _, _)) => 2 
  case CC_A(CC_A(_, _, _), (_,_), CC_B(_, _)) => 3 
  case CC_A(CC_B(_, _), (_,_), CC_B(_, _)) => 4 
  case CC_A(CC_C(_), (_,_), CC_B(_, _)) => 5 
  case CC_A(CC_A(_, _, _), (_,_), CC_C(_)) => 6 
  case CC_A(CC_B(_, _), (_,_), CC_C(_)) => 7 
  case CC_A(CC_C(_), (_,_), CC_C(_)) => 8 
  case CC_B(_, _) => 9 
  case CC_C(_) => 10 
}
}