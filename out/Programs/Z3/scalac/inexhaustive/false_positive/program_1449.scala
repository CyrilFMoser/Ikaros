package Program_31 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_B[D, C](a: T_A, b: D, c: T_B[D, D]) extends T_B[C, D]
case class CC_C[E, F](a: CC_B[E, F], b: Int) extends T_B[E, Int]
case class CC_D[G](a: Byte, b: T_B[G, G], c: (CC_A,T_A)) extends T_B[G, Int]

val v_a: T_B[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_C(CC_B(_, _, _), _) => 1 
  case CC_D(0, _, (CC_A(_, _, _),CC_A(_, _, _))) => 2 
  case CC_D(0, _, _) => 3 
  case CC_D(_, CC_B(_, _, _), (CC_A(_, _, _),CC_A(_, _, _))) => 4 
  case CC_D(_, _, (CC_A(_, _, _),CC_A(_, _, _))) => 5 
  case CC_B(_, _, CC_D(_, _, _)) => 6 
  case CC_B(_, _, CC_B(_, _, _)) => 7 
  case CC_B(_, 12, CC_B(_, _, _)) => 8 
  case CC_B(CC_A(_, _, _), 12, CC_D(_, _, _)) => 9 
  case CC_B(CC_A(_, _, _), _, CC_C(_, _)) => 10 
  case CC_B(CC_A(_, _, _), 12, _) => 11 
  case CC_B(_, 12, _) => 12 
  case CC_B(_, _, CC_C(_, _)) => 13 
  case CC_B(CC_A(_, _, _), 12, CC_B(_, _, _)) => 14 
  case CC_B(CC_A(_, _, _), _, _) => 15 
  case CC_B(_, _, _) => 16 
  case CC_B(CC_A(_, _, _), 12, CC_C(_, _)) => 17 
  case CC_B(_, 12, CC_C(_, _)) => 18 
}
}
// This is not matched: (CC_C Boolean T_A Wildcard Int (T_B Boolean Int))
// This is not matched: Pattern match is empty without constants