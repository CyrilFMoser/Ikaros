package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: ((Char,Boolean),T_A[Char])) extends T_A[B]
case class CC_B[C](a: Boolean) extends T_A[C]
case class CC_C[D](a: T_A[D]) extends T_A[D]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_), _) => 1 
  case CC_A(CC_C(CC_A(_, _)), _) => 2 
  case CC_A(CC_C(CC_B(_)), _) => 3 
  case CC_A(CC_C(CC_C(_)), _) => 4 
  case CC_B(_) => 5 
  case CC_C(CC_A(CC_A(_, _), (_,_))) => 6 
  case CC_C(CC_A(CC_B(_), (_,_))) => 7 
  case CC_C(CC_A(CC_C(_), (_,_))) => 8 
  case CC_C(CC_B(_)) => 9 
  case CC_C(CC_C(_)) => 10 
}
}