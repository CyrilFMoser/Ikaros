package Program_12 

package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_B], b: Byte) extends T_A[Boolean, C]
case class CC_B(a: CC_A[(Boolean,Boolean)], b: (T_B,T_B)) extends T_B
case class CC_C(a: T_A[Boolean, T_B], b: CC_B) extends T_B
case class CC_D[D](a: T_A[Boolean, D], b: CC_A[D], c: CC_A[D]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_A(_, _)) => 0 
  case CC_D(CC_A(_, _), _, CC_A(_, _)) => 1 
  case CC_C(CC_A(_, _), _) => 2 
  case CC_B(_, (CC_D(_, _, _),CC_D(_, _, _))) => 3 
  case CC_B(_, _) => 4 
  case CC_B(CC_A(_, _), (CC_B(_, _),CC_C(_, _))) => 5 
  case CC_B(_, (CC_B(_, _),CC_B(_, _))) => 6 
  case CC_B(_, (CC_D(_, _, _),CC_B(_, _))) => 7 
  case CC_B(CC_A(_, _), _) => 8 
  case CC_B(_, (CC_D(_, _, _),CC_C(_, _))) => 9 
  case CC_B(CC_A(_, _), (CC_D(_, _, _),CC_B(_, _))) => 10 
  case CC_B(CC_A(_, _), (CC_D(_, _, _),CC_C(_, _))) => 11 
  case CC_B(_, (CC_C(_, _),CC_B(_, _))) => 12 
  case CC_B(CC_A(_, _), (CC_D(_, _, _),CC_D(_, _, _))) => 13 
  case CC_B(CC_A(_, _), (CC_C(_, _),CC_C(_, _))) => 14 
  case CC_B(CC_A(_, _), (CC_C(_, _),CC_B(_, _))) => 15 
  case CC_B(CC_A(_, _), (CC_C(_, _),CC_D(_, _, _))) => 16 
  case CC_B(_, (CC_B(_, _),CC_D(_, _, _))) => 17 
  case CC_B(_, (CC_C(_, _),CC_D(_, _, _))) => 18 
}
}
// This is not matched: (CC_D T_B Wildcard Wildcard Wildcard T_B)
// This is not matched: (CC_A T_A)