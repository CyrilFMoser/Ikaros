package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: Char, c: T_A[Byte]) extends T_A[Byte]
case class CC_B(a: (T_A[Byte],T_A[Byte])) extends T_A[Byte]
case class CC_C(a: T_A[Byte]) extends T_A[Byte]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((CC_A(_, _, _),CC_A(_, _, _))) => 0 
  case CC_B((CC_A(_, _, _),CC_B(_))) => 1 
  case CC_B((CC_A(_, _, _),CC_C(_))) => 2 
  case CC_B((CC_B(_),CC_A(_, _, _))) => 3 
  case CC_B((CC_B(_),CC_B(_))) => 4 
  case CC_B((CC_B(_),CC_C(_))) => 5 
  case CC_B((CC_C(_),CC_A(_, _, _))) => 6 
  case CC_B((CC_C(_),CC_B(_))) => 7 
  case CC_B((CC_C(_),CC_C(_))) => 8 
}
}