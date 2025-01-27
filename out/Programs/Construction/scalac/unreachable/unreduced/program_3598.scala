package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Char],T_A[Char]), b: T_A[T_A[Char]]) extends T_A[Char]
case class CC_B() extends T_A[Char]
case class CC_C(a: Boolean, b: CC_B, c: CC_B) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),CC_A(_, _)), _) => 0 
  case CC_A((CC_A(_, _),CC_B()), _) => 1 
  case CC_A((CC_A(_, _),CC_C(_, _, _)), _) => 2 
  case CC_A((CC_B(),CC_A(_, _)), _) => 3 
  case CC_A((CC_B(),CC_B()), _) => 4 
  case CC_A((CC_B(),CC_C(_, _, _)), _) => 5 
  case CC_A((CC_C(_, _, _),CC_A(_, _)), _) => 6 
  case CC_A((CC_C(_, _, _),CC_B()), _) => 7 
  case CC_A((CC_C(_, _, _),CC_C(_, _, _)), _) => 8 
  case CC_B() => 9 
  case CC_C(_, CC_B(), CC_B()) => 10 
}
}