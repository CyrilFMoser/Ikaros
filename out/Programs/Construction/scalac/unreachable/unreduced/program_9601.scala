package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: ((Char,Byte),(T_A,T_A)), c: (T_A,T_B[T_A])) extends T_A
case class CC_B[B](a: T_A) extends T_A
case class CC_C(a: Int, b: T_B[Char], c: T_A) extends T_A
case class CC_D() extends T_B[T_A]
case class CC_E(a: T_B[T_A], b: T_B[T_A], c: T_B[CC_B[CC_D]]) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(CC_A(_, _, _), (_,_), (_,_))) => 1 
  case CC_B(CC_A(CC_B(_), (_,_), (_,_))) => 2 
  case CC_B(CC_A(CC_C(_, _, _), (_,_), (_,_))) => 3 
  case CC_B(CC_B(CC_A(_, _, _))) => 4 
  case CC_B(CC_B(CC_B(_))) => 5 
  case CC_B(CC_B(CC_C(_, _, _))) => 6 
  case CC_B(CC_C(_, _, CC_A(_, _, _))) => 7 
  case CC_B(CC_C(_, _, CC_C(_, _, _))) => 8 
  case CC_C(_, _, CC_A(_, _, _)) => 9 
  case CC_C(_, _, CC_B(CC_A(_, _, _))) => 10 
  case CC_C(_, _, CC_B(CC_B(_))) => 11 
  case CC_C(_, _, CC_B(CC_C(_, _, _))) => 12 
  case CC_C(_, _, CC_C(12, _, CC_A(_, _, _))) => 13 
  case CC_C(_, _, CC_C(12, _, CC_B(_))) => 14 
  case CC_C(_, _, CC_C(12, _, CC_C(_, _, _))) => 15 
  case CC_C(_, _, CC_C(_, _, CC_A(_, _, _))) => 16 
  case CC_C(_, _, CC_C(_, _, CC_B(_))) => 17 
  case CC_C(_, _, CC_C(_, _, CC_C(_, _, _))) => 18 
}
}
// This is not matched: CC_B(CC_C(_, _, CC_B(_)))