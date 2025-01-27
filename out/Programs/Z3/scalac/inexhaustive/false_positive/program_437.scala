package Program_31 

package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: C, c: T_A[C, C]) extends T_A[C, T_B]
case class CC_B[D](a: D, b: CC_A[D]) extends T_A[D, T_B]
case class CC_C[E](a: Boolean, b: T_A[E, E]) extends T_A[E, T_B]
case class CC_D(a: (Boolean,T_B)) extends T_B
case class CC_E[F](a: CC_A[F], b: CC_D, c: T_B) extends T_B
case class CC_F(a: T_B, b: T_A[T_B, T_B], c: ((Int,Char),(Int,Boolean))) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D((_,CC_E(_, _, _))) => 0 
  case CC_D((_,CC_D(_))) => 1 
  case CC_D((_,CC_F(_, _, _))) => 2 
  case CC_E(CC_A(_, _, _), CC_D(_), CC_E(_, _, _)) => 3 
  case CC_E(_, _, CC_D(_)) => 4 
  case CC_E(_, _, _) => 5 
  case CC_E(CC_A(_, _, _), _, CC_E(_, _, _)) => 6 
  case CC_E(CC_A(_, _, _), CC_D(_), CC_F(_, _, _)) => 7 
  case CC_F(CC_F(_, _, _), CC_A(_, _, _), ((_,_),(_,_))) => 8 
  case CC_F(_, CC_C(_, _), ((_,_),(_,_))) => 9 
  case CC_F(CC_D(_), CC_B(_, _), ((_,_),(_,_))) => 10 
  case CC_F(_, CC_A(_, _, _), _) => 11 
  case CC_F(CC_D(_), CC_C(_, _), ((_,_),(_,_))) => 12 
  case CC_F(CC_E(_, _, _), _, ((_,_),(_,_))) => 13 
  case CC_F(CC_D(_), _, ((_,_),(_,_))) => 14 
  case CC_F(_, _, ((_,_),(_,_))) => 15 
  case CC_F(CC_F(_, _, _), CC_A(_, _, _), _) => 16 
}
}
// This is not matched: (CC_D (Tuple Boolean (CC_E T_B Wildcard (CC_D Wildcard T_B) Wildcard T_B)) T_B)
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)