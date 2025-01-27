package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, (Boolean,Int)], T_A[Byte, (Byte,Int)]], b: (T_A[(Int,Boolean), Byte],T_A[Int, Byte])) extends T_A[Char, T_A[Boolean, T_A[Char, Char]]]
case class CC_B(a: Int) extends T_A[Char, T_A[Boolean, T_A[Char, Char]]]
case class CC_C() extends T_A[Char, T_A[Boolean, T_A[Char, Char]]]

val v_a: T_A[Char, T_A[Boolean, T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(12) => 1 
  case CC_B(_) => 2 
}
}
// This is not matched: CC_C()