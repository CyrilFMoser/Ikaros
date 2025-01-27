package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B(a: T_A, b: T_B[(Byte,CC_A)], c: CC_A) extends T_A
case class CC_C(a: T_B[Char], b: T_B[CC_B], c: T_B[CC_A]) extends T_B[Char]
case class CC_D(a: (Char,T_A), b: (CC_C,T_B[Char])) extends T_B[Char]
case class CC_E[B](a: Char) extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, _) => 0 
  case CC_C(CC_C(CC_D(_, _), _, _), _, _) => 1 
  case CC_C(CC_C(CC_E(_), _, _), _, _) => 2 
  case CC_C(CC_D((_,_), (_,_)), _, _) => 3 
  case CC_C(CC_E(_), _, _) => 4 
  case CC_D((_,CC_A(_)), (CC_C(_, _, _),CC_C(_, _, _))) => 5 
  case CC_D((_,CC_A(_)), (CC_C(_, _, _),CC_D(_, _))) => 6 
  case CC_D((_,CC_A(_)), (CC_C(_, _, _),CC_E(_))) => 7 
  case CC_D((_,CC_B(_, _, _)), (CC_C(_, _, _),CC_C(_, _, _))) => 8 
  case CC_D((_,CC_B(_, _, _)), (CC_C(_, _, _),CC_D(_, _))) => 9 
  case CC_D((_,CC_B(_, _, _)), (CC_C(_, _, _),CC_E(_))) => 10 
  case CC_E(_) => 11 
}
}