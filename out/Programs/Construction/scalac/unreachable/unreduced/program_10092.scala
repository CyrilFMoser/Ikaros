package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[Char]]
case class CC_B(a: Boolean, b: T_A[T_B]) extends T_A[T_A[Char]]
case class CC_C(a: CC_A) extends T_A[T_A[Char]]
case class CC_D(a: CC_B, b: T_B) extends T_B
case class CC_E(a: CC_C, b: CC_A) extends T_B
case class CC_F(a: (T_A[CC_A],CC_E), b: (CC_A,Boolean), c: T_A[T_A[Char]]) extends T_B

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _)) => 0 
  case CC_A(CC_E(_, _)) => 1 
  case CC_A(CC_F((_,_), (_,_), CC_A(_))) => 2 
  case CC_A(CC_F((_,_), (_,_), CC_B(_, _))) => 3 
  case CC_A(CC_F((_,_), (_,_), CC_C(_))) => 4 
  case CC_C(CC_A(CC_D(_, _))) => 5 
  case CC_C(CC_A(CC_E(_, _))) => 6 
  case CC_C(CC_A(CC_F(_, _, _))) => 7 
}
}
// This is not matched: CC_B(_, _)