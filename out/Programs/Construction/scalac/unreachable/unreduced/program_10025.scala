package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], Boolean], b: T_B[Char, Int]) extends T_A
case class CC_B(a: (CC_A,T_A), b: T_B[T_A, Char], c: (T_B[Char, Byte],(T_A,T_A))) extends T_A
case class CC_C(a: T_A, b: T_A) extends T_A
case class CC_D[C](a: Int) extends T_B[C, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((CC_A(_, _),CC_A(_, _)), _, _) => 1 
  case CC_B((CC_A(_, _),CC_B(_, _, _)), _, _) => 2 
  case CC_B((CC_A(_, _),CC_C(_, _)), _, _) => 3 
  case CC_C(_, CC_A(_, _)) => 4 
  case CC_C(_, CC_B((_,_), _, (_,_))) => 5 
  case CC_C(_, CC_C(_, CC_A(_, _))) => 6 
  case CC_C(_, CC_C(_, CC_B(_, _, _))) => 7 
  case CC_C(_, CC_C(_, CC_C(_, _))) => 8 
}
}