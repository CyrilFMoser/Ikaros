package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: (T_A[(Char,Int), Int],Boolean)) extends T_A[T_A[C, T_A[C, C]], C]
case class CC_B(a: T_A[T_A[Boolean, (Boolean,Boolean)], T_A[Char, Byte]], b: Char, c: T_A[Boolean, Byte]) extends T_A[T_A[((Char,Boolean),CC_A[Int]), T_A[((Char,Boolean),CC_A[Int]), ((Char,Boolean),CC_A[Int])]], ((Char,Boolean),CC_A[Int])]

val v_a: T_A[T_A[((Char,Boolean),CC_A[Int]), T_A[((Char,Boolean),CC_A[Int]), ((Char,Boolean),CC_A[Int])]], ((Char,Boolean),CC_A[Int])] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, _, _) => 2 
}
}