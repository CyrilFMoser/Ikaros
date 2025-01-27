package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: E, b: T_B[E]) extends T_A[E, D]
case class CC_B[F, G](a: T_A[G, G], b: T_A[F, F]) extends T_A[G, F]
case class CC_C(a: CC_A[CC_A[Byte, (Int,Int)], CC_B[Boolean, Boolean]]) extends T_B[T_A[(Byte,(Byte,Boolean)), T_A[Boolean, Char]]]
case class CC_D(a: T_B[T_A[CC_C, Byte]], b: T_A[CC_B[(Char,Byte), CC_C], T_A[CC_C, CC_C]]) extends T_B[T_A[(Byte,(Byte,Boolean)), T_A[Boolean, Char]]]

val v_a: T_A[CC_D, T_B[T_A[(Byte,(Byte,Boolean)), T_A[Boolean, Char]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, CC_A(_, _)), _) => 0 
  case CC_A(CC_D(_, CC_B(_, _)), _) => 1 
  case CC_B(_, _) => 2 
}
}