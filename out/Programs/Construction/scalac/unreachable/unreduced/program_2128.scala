package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Boolean, Char],Boolean), b: (T_A[Boolean, Byte],T_A[Boolean, Int])) extends T_A[Boolean, C]
case class CC_B[D](a: T_A[D, D]) extends T_A[Boolean, D]
case class CC_C(a: CC_A[T_A[Boolean, Char]], b: Char) extends T_A[Boolean, Boolean]

val v_a: T_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),_), (CC_A(_, _),CC_A(_, _))) => 0 
  case CC_A((CC_B(_),_), (CC_A(_, _),CC_A(_, _))) => 1 
  case CC_A((CC_A(_, _),_), (CC_A(_, _),CC_B(_))) => 2 
  case CC_A((CC_B(_),_), (CC_A(_, _),CC_B(_))) => 3 
  case CC_A((CC_A(_, _),_), (CC_B(_),CC_A(_, _))) => 4 
  case CC_A((CC_B(_),_), (CC_B(_),CC_A(_, _))) => 5 
  case CC_A((CC_A(_, _),_), (CC_B(_),CC_B(_))) => 6 
  case CC_A((CC_B(_),_), (CC_B(_),CC_B(_))) => 7 
  case CC_B(CC_A((_,_), (_,_))) => 8 
  case CC_B(CC_B(CC_A(_, _))) => 9 
  case CC_B(CC_B(CC_B(_))) => 10 
  case CC_B(CC_B(CC_C(_, _))) => 11 
  case CC_B(CC_C(_, _)) => 12 
  case CC_C(_, _) => 13 
}
}