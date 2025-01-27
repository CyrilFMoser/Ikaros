package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: T_B[CC_A[Int]], b: Boolean) extends T_A[T_A[Char]]
case class CC_C(a: CC_A[Char]) extends T_B[T_A[T_A[Char]]]
case class CC_D(a: CC_A[CC_C], b: T_A[T_A[CC_C]], c: (T_A[CC_C],T_B[CC_C])) extends T_B[T_A[((Char,Byte),CC_B)]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}