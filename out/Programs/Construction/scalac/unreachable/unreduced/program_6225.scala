package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Boolean, b: T_B, c: T_A[T_B, Char]) extends T_A[T_B, Char]
case class CC_B(a: (T_A[T_B, CC_A],T_B), b: CC_A) extends T_A[T_B, Char]
case class CC_C(a: (T_A[Byte, CC_B],CC_A), b: CC_A) extends T_A[T_B, Char]
case class CC_D(a: T_B, b: T_A[T_A[T_B, Char], ((Boolean,Boolean),CC_C)]) extends T_B

val v_a: T_A[T_B, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(true, CC_D(_, _), CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(true, CC_D(_, _), CC_B(_, _))) => 1 
  case CC_A(_, _, CC_A(true, CC_D(_, _), CC_C(_, _))) => 2 
  case CC_A(_, _, CC_A(false, CC_D(_, _), CC_A(_, _, _))) => 3 
  case CC_A(_, _, CC_A(false, CC_D(_, _), CC_B(_, _))) => 4 
  case CC_A(_, _, CC_A(false, CC_D(_, _), CC_C(_, _))) => 5 
  case CC_A(_, _, CC_B((_,_), _)) => 6 
  case CC_A(_, _, CC_C((_,_), CC_A(_, _, _))) => 7 
  case CC_B(_, _) => 8 
  case CC_C((_,CC_A(_, _, _)), _) => 9 
}
}