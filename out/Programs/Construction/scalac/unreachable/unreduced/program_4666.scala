package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, (Boolean,Char)], T_A[(Int,Byte), Boolean]], b: T_A[Boolean, Boolean], c: T_A[(Boolean,Byte), (Boolean,Char)]) extends T_A[T_A[T_A[Int, (Boolean,Boolean)], Byte], T_A[T_A[Char, Char], Char]]
case class CC_B(a: Boolean, b: (CC_A,CC_A)) extends T_A[T_A[T_A[Int, (Boolean,Boolean)], Byte], T_A[T_A[Char, Char], Char]]
case class CC_C() extends T_A[T_A[T_A[Int, (Boolean,Boolean)], Byte], T_A[T_A[Char, Char], Char]]

val v_a: T_A[T_A[T_A[Int, (Boolean,Boolean)], Byte], T_A[T_A[Char, Char], Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}