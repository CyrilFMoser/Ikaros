package Program_29 

package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B, c: ((Char,Char),T_B)) extends T_A[T_B]
case class CC_B[B, C](a: T_A[T_B]) extends T_A[B]
case class CC_C(a: T_A[T_B]) extends T_B
case class CC_D() extends T_B
case class CC_E(a: T_B) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(CC_C(_), _, _) => 1 
  case CC_A(CC_E(_), CC_C(_), ((_,_),CC_D())) => 2 
  case CC_A(CC_C(_), CC_C(_), _) => 3 
  case CC_A(_, CC_E(_), _) => 4 
  case CC_A(_, _, ((_,_),CC_E(_))) => 5 
  case CC_A(CC_C(_), CC_D(), ((_,_),CC_D())) => 6 
  case CC_A(CC_C(_), CC_C(_), ((_,_),CC_D())) => 7 
  case CC_A(CC_D(), CC_C(_), ((_,_),CC_E(_))) => 8 
  case CC_A(CC_C(_), CC_C(_), ((_,_),CC_C(_))) => 9 
  case CC_A(CC_D(), _, _) => 10 
  case CC_A(_, CC_C(_), ((_,_),CC_D())) => 11 
  case CC_A(_, _, _) => 12 
  case CC_A(_, CC_D(), ((_,_),CC_D())) => 13 
  case CC_A(CC_D(), CC_E(_), _) => 14 
  case CC_A(CC_C(_), CC_D(), ((_,_),CC_E(_))) => 15 
  case CC_A(_, _, ((_,_),CC_D())) => 16 
  case CC_A(CC_D(), CC_D(), ((_,_),CC_E(_))) => 17 
  case CC_A(CC_D(), CC_E(_), ((_,_),CC_D())) => 18 
  case CC_A(CC_D(), CC_C(_), _) => 19 
  case CC_A(CC_E(_), CC_D(), ((_,_),CC_D())) => 20 
}
}
// This is not matched: (CC_B T_B T_B Wildcard (T_A T_B))
// This is not matched: (CC_B T_B T_B Wildcard (T_A T_B))