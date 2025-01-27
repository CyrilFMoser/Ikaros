package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_A[T_B[T_B[Boolean]], T_B[T_B[Boolean]]], b: T_A[T_B[Char], D], c: T_B[E]) extends T_A[E, D]
case class CC_B(a: (Char,(Boolean,(Byte,Byte))), b: T_A[T_A[Boolean, Char], T_A[(Char,Int), Byte]], c: (Byte,(Boolean,Char))) extends T_B[T_A[T_A[Char, Byte], CC_A[Byte, Boolean]]]
case class CC_C(a: Char, b: T_A[CC_B, CC_A[CC_B, (Boolean,Int)]], c: T_A[T_A[CC_B, (Int,Char)], CC_A[Byte, CC_B]]) extends T_B[T_A[T_A[Char, Byte], CC_A[Byte, Boolean]]]

val v_a: T_B[T_A[T_A[Char, Byte], CC_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B((_,(_,_)), CC_A(_, _, _), (_,(_,_))) => 0 
  case CC_C(_, _, _) => 1 
}
}