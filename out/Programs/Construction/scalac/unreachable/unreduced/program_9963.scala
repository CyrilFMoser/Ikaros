package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B]
case class CC_B(a: (T_A[T_B],T_B), b: (T_B,Char)) extends T_A[T_B]
case class CC_C(a: T_A[T_B]) extends T_A[T_B]
case class CC_D(a: T_A[CC_C], b: CC_B, c: T_A[T_A[CC_A]]) extends T_B
case class CC_E() extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(CC_D(_, _, _))) => 2 
  case CC_C(CC_A(CC_E())) => 3 
  case CC_C(CC_B((_,_), (_,_))) => 4 
}
}
// This is not matched: CC_C(CC_C(_))