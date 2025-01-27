package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(T_A,T_A), T_A], b: Char, c: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B(a: ((Byte,CC_A),CC_A), b: (Boolean,T_B[Boolean, CC_A])) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D(a: (CC_A,T_B[Byte, Char])) extends T_B[Byte, Char]
case class CC_E(a: CC_B) extends T_B[Byte, Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(((_,_),CC_A(_, _, _)), (_,_)) => 1 
  case CC_C(CC_A(_, _, _)) => 2 
  case CC_C(CC_B((_,_), (_,_))) => 3 
  case CC_C(CC_C(_)) => 4 
}
}