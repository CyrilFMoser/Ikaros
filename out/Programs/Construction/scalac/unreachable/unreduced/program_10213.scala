package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Byte, b: D, c: T_A[D]) extends T_A[D]
case class CC_B(a: T_A[CC_A[Byte]], b: T_A[T_B[Char, Byte]]) extends T_B[(T_B[Char, Byte],((Byte,Int),(Boolean,Boolean))), T_B[(Byte,Byte), T_B[Int, Char]]]
case class CC_C(a: T_A[T_B[CC_B, CC_B]]) extends T_B[(T_B[Char, Byte],((Byte,Int),(Boolean,Boolean))), T_B[(Byte,Byte), T_B[Int, Char]]]

val v_a: T_B[(T_B[Char, Byte],((Byte,Int),(Boolean,Boolean))), T_B[(Byte,Byte), T_B[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_A(_, _, _), _), CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_C(_) => 1 
}
}