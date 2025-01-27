package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Char], T_A[(Int,Int), Byte]], b: (T_A[Byte, Char],T_A[Byte, Char])) extends T_A[T_A[(Char,Int), T_A[Char, Char]], T_A[T_A[Byte, (Boolean,Byte)], Int]]
case class CC_B(a: Boolean, b: Char) extends T_A[T_A[(Char,Int), T_A[Char, Char]], T_A[T_A[Byte, (Boolean,Byte)], Int]]
case class CC_C(a: T_A[T_A[Int, CC_A], CC_B], b: CC_B) extends T_A[T_A[(Char,Int), T_A[Char, Char]], T_A[T_A[Byte, (Boolean,Byte)], Int]]

val v_a: T_A[T_A[(Char,Int), T_A[Char, Char]], T_A[T_A[Byte, (Boolean,Byte)], Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, CC_B(_, 'x')) => 2 
  case CC_C(_, CC_B(_, _)) => 3 
}
}