package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: ((Boolean,(Boolean,Int)),T_A[Byte, (Int,Boolean)]), b: T_A[T_A[Boolean, Char], T_A[Boolean, Char]]) extends T_A[T_A[Boolean, T_A[Byte, Byte]], T_A[Byte, T_A[Char, Int]]]
case class CC_B() extends T_A[T_A[Boolean, T_A[Byte, Byte]], T_A[Byte, T_A[Char, Int]]]

val v_a: T_A[T_A[Boolean, T_A[Byte, Byte]], T_A[Byte, T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}