package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, T_B[E, E]], c: T_A[T_B[E, E], Byte]) extends T_A[E, T_B[E, E]]
case class CC_B(a: (CC_A[Int],T_B[Byte, Byte]), b: T_B[Byte, (Char,(Char,Int))]) extends T_A[T_B[T_B[(Boolean,Byte), Int], CC_A[Char]], T_B[T_B[T_B[(Boolean,Byte), Int], CC_A[Char]], T_B[T_B[(Boolean,Byte), Int], CC_A[Char]]]]

val v_a: T_A[T_B[T_B[(Boolean,Byte), Int], CC_A[Char]], T_B[T_B[T_B[(Boolean,Byte), Int], CC_A[Char]], T_B[T_B[(Boolean,Byte), Int], CC_A[Char]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}