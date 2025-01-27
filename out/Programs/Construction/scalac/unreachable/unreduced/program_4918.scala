package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[Int], (Char,Boolean)], b: (T_B[Char],T_A[Int, Byte])) extends T_A[T_B[T_A[Char, Char]], T_B[Char]]
case class CC_B() extends T_A[T_B[T_A[Char, Char]], T_B[Char]]
case class CC_C() extends T_A[T_B[T_A[Char, Char]], T_B[Char]]
case class CC_D[D](a: (Boolean,Byte)) extends T_B[D]

val v_a: T_A[T_B[T_A[Char, Char]], T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B()