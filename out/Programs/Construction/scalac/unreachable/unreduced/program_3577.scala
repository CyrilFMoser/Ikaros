package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Byte]
case class CC_B(a: (T_A[Byte],T_A[Char]), b: CC_A, c: T_A[T_A[Byte]]) extends T_A[Byte]
case class CC_C(a: (T_A[Byte],T_A[Byte])) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),_), CC_A(), _) => 1 
  case CC_B((CC_B(_, _, _),_), CC_A(), _) => 2 
  case CC_B((CC_C(_),_), CC_A(), _) => 3 
  case CC_C((CC_A(),CC_A())) => 4 
  case CC_C((CC_A(),CC_B(_, _, _))) => 5 
  case CC_C((CC_A(),CC_C(_))) => 6 
  case CC_C((CC_B(_, _, _),CC_A())) => 7 
  case CC_C((CC_B(_, _, _),CC_B(_, _, _))) => 8 
  case CC_C((CC_B(_, _, _),CC_C(_))) => 9 
  case CC_C((CC_C(_),CC_A())) => 10 
  case CC_C((CC_C(_),CC_B(_, _, _))) => 11 
  case CC_C((CC_C(_),CC_C(_))) => 12 
}
}