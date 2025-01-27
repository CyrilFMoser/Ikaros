package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Boolean, Byte],T_A[Boolean, Int]), b: T_A[Boolean, C]) extends T_A[Boolean, C]
case class CC_B[D](a: T_A[D, T_A[Boolean, D]], b: (T_A[Boolean, (Boolean,Int)],Boolean)) extends T_A[Boolean, D]
case class CC_C(a: T_A[Boolean, CC_A[Boolean]], b: T_A[Boolean, T_A[Boolean, Byte]]) extends T_A[T_A[Boolean, CC_A[Int]], T_A[Boolean, T_A[Boolean, (Byte,Char)]]]

val v_a: T_A[Boolean, T_A[T_A[Boolean, CC_A[Int]], T_A[Boolean, T_A[Boolean, (Byte,Char)]]]] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),CC_A(_, _)), CC_A(_, _)) => 0 
  case CC_A((CC_A(_, _),CC_A(_, _)), CC_B(_, _)) => 1 
  case CC_A((CC_A(_, _),CC_B(_, _)), CC_A(_, _)) => 2 
  case CC_A((CC_A(_, _),CC_B(_, _)), CC_B(_, _)) => 3 
  case CC_A((CC_B(_, _),CC_A(_, _)), CC_A(_, _)) => 4 
  case CC_A((CC_B(_, _),CC_A(_, _)), CC_B(_, _)) => 5 
  case CC_A((CC_B(_, _),CC_B(_, _)), CC_A(_, _)) => 6 
  case CC_A((CC_B(_, _),CC_B(_, _)), CC_B(_, _)) => 7 
  case CC_B(_, _) => 8 
}
}