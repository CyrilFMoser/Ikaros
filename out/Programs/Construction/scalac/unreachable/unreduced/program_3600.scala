package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[Char]
case class CC_B(a: (T_A[Char],T_A[Char]), b: Int, c: Boolean) extends T_A[Char]
case class CC_C(a: Boolean) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((CC_A(_),CC_A(_)), 12, _) => 1 
  case CC_B((CC_A(_),CC_A(_)), _, _) => 2 
  case CC_B((CC_A(_),CC_B(_, _, _)), 12, _) => 3 
  case CC_B((CC_A(_),CC_B(_, _, _)), _, _) => 4 
  case CC_B((CC_A(_),CC_C(_)), 12, _) => 5 
  case CC_B((CC_A(_),CC_C(_)), _, _) => 6 
  case CC_B((CC_B(_, _, _),CC_A(_)), 12, _) => 7 
  case CC_B((CC_B(_, _, _),CC_A(_)), _, _) => 8 
  case CC_B((CC_B(_, _, _),CC_B(_, _, _)), 12, _) => 9 
  case CC_B((CC_B(_, _, _),CC_B(_, _, _)), _, _) => 10 
  case CC_B((CC_B(_, _, _),CC_C(_)), 12, _) => 11 
  case CC_B((CC_B(_, _, _),CC_C(_)), _, _) => 12 
  case CC_B((CC_C(_),CC_A(_)), 12, _) => 13 
  case CC_B((CC_C(_),CC_A(_)), _, _) => 14 
  case CC_B((CC_C(_),CC_B(_, _, _)), 12, _) => 15 
  case CC_B((CC_C(_),CC_B(_, _, _)), _, _) => 16 
  case CC_B((CC_C(_),CC_C(_)), 12, _) => 17 
  case CC_B((CC_C(_),CC_C(_)), _, _) => 18 
  case CC_C(_) => 19 
}
}