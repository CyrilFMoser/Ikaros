package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_A[T_B[Int, (Byte,Int)], T_B[Byte, Char]], T_A[T_B[Byte, Char], (Boolean,Byte)]]
case class CC_B(a: T_A[T_B[Char, CC_A], T_B[CC_A, (Char,Boolean)]]) extends T_A[T_A[T_B[Int, (Byte,Int)], T_B[Byte, Char]], T_A[T_B[Byte, Char], (Boolean,Byte)]]
case class CC_C(a: CC_A, b: CC_B, c: Byte) extends T_A[T_A[T_B[Int, (Byte,Int)], T_B[Byte, Char]], T_A[T_B[Byte, Char], (Boolean,Byte)]]
case class CC_D[E, F]() extends T_B[E, F]
case class CC_E[G](a: Int) extends T_B[G, Char]

val v_a: T_A[T_A[T_B[Int, (Byte,Int)], T_B[Byte, Char]], T_A[T_B[Byte, Char], (Boolean,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, 0) => 2 
  case CC_C(_, _, _) => 3 
}
}