package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Char, b: Int, c: T_A[T_B]) extends T_A[T_A[Char]]
case class CC_B(a: CC_A, b: T_B) extends T_A[T_A[Char]]
case class CC_C(a: (T_A[CC_A],(CC_B,CC_A)), b: T_A[T_A[Char]], c: T_A[T_A[Char]]) extends T_B
case class CC_D(a: Char, b: Boolean) extends T_B
case class CC_E(a: (T_A[T_B],Char), b: T_A[T_A[T_B]], c: (T_A[CC_D],(T_B,Char))) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C((_,(_,_)), CC_A(_, _, _), _) => 0 
  case CC_C((_,(_,_)), CC_B(_, _), _) => 1 
  case CC_D(_, _) => 2 
  case CC_E(_, _, (_,(_,_))) => 3 
}
}