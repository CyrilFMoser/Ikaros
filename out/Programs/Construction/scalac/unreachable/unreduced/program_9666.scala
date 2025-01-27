package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[Int]], b: T_B) extends T_A[Int]
case class CC_B(a: T_A[Int], b: ((CC_A,T_B),T_B), c: T_A[Int]) extends T_A[Int]
case class CC_C(a: T_B) extends T_B
case class CC_D(a: CC_A, b: Int) extends T_B
case class CC_E(a: T_A[CC_A]) extends T_B

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, CC_C(_)), _, CC_A(_, CC_C(_))) => 1 
  case CC_B(CC_A(_, CC_D(_, _)), _, CC_A(_, CC_C(_))) => 2 
  case CC_B(CC_A(_, CC_E(_)), _, CC_A(_, CC_C(_))) => 3 
  case CC_B(CC_B(_, _, _), _, CC_A(_, CC_C(_))) => 4 
  case CC_B(CC_A(_, CC_C(_)), _, CC_A(_, CC_D(_, _))) => 5 
  case CC_B(CC_A(_, CC_D(_, _)), _, CC_A(_, CC_D(_, _))) => 6 
  case CC_B(CC_A(_, CC_E(_)), _, CC_A(_, CC_D(_, _))) => 7 
  case CC_B(CC_B(_, _, _), _, CC_A(_, CC_D(_, _))) => 8 
  case CC_B(CC_A(_, CC_C(_)), _, CC_A(_, CC_E(_))) => 9 
  case CC_B(CC_A(_, CC_D(_, _)), _, CC_A(_, CC_E(_))) => 10 
  case CC_B(CC_A(_, CC_E(_)), _, CC_A(_, CC_E(_))) => 11 
  case CC_B(CC_A(_, CC_C(_)), _, CC_B(_, (_,_), CC_A(_, _))) => 12 
  case CC_B(CC_A(_, CC_D(_, _)), _, CC_B(_, (_,_), CC_A(_, _))) => 13 
  case CC_B(CC_A(_, CC_E(_)), _, CC_B(_, (_,_), CC_A(_, _))) => 14 
  case CC_B(CC_B(_, _, _), _, CC_B(_, (_,_), CC_A(_, _))) => 15 
  case CC_B(CC_A(_, CC_C(_)), _, CC_B(_, (_,_), CC_B(_, _, _))) => 16 
  case CC_B(CC_A(_, CC_D(_, _)), _, CC_B(_, (_,_), CC_B(_, _, _))) => 17 
  case CC_B(CC_A(_, CC_E(_)), _, CC_B(_, (_,_), CC_B(_, _, _))) => 18 
  case CC_B(CC_B(_, _, _), _, CC_B(_, (_,_), CC_B(_, _, _))) => 19 
}
}
// This is not matched: CC_B(CC_B(_, _, _), _, CC_A(_, CC_E(_)))