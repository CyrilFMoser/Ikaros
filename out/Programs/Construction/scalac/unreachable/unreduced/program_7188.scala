package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: (Boolean,(Char,Char)), c: T_A[T_A[Int]]) extends T_A[Int]
case class CC_B(a: T_A[Int]) extends T_A[Int]
case class CC_C(a: CC_B) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), (_,(_,_)), _) => 0 
  case CC_A(CC_B(CC_A(_, _, _)), (_,(_,_)), _) => 1 
  case CC_A(CC_B(CC_B(_)), (_,(_,_)), _) => 2 
  case CC_A(CC_B(CC_C(_)), (_,(_,_)), _) => 3 
  case CC_A(CC_C(_), (_,(_,_)), _) => 4 
  case CC_B(CC_A(CC_A(_, _, _), _, _)) => 5 
  case CC_B(CC_A(CC_B(_), _, _)) => 6 
  case CC_B(CC_A(CC_C(_), _, _)) => 7 
  case CC_B(CC_B(CC_A(_, _, _))) => 8 
  case CC_B(CC_B(CC_B(_))) => 9 
  case CC_B(CC_B(CC_C(_))) => 10 
  case CC_B(CC_C(_)) => 11 
  case CC_C(_) => 12 
}
}