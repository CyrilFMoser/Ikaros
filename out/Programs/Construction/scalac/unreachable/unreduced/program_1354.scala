package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: Boolean) extends T_A[C, ((Boolean,Byte),T_A[Int, Char])]
case class CC_B() extends T_A[T_A[T_A[Char, Int], Int], ((Boolean,Byte),T_A[Int, Char])]
case class CC_C[D](a: CC_A[D]) extends T_A[D, ((Boolean,Byte),T_A[Int, Char])]

val v_a: T_A[T_A[T_A[Char, Int], Int], ((Boolean,Byte),T_A[Int, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _)) => 2 
}
}